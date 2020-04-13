<template>

<div class="card-footer clearfix">
  <ul class="pagination pagination-sm m-0 float-right ">
    <li class="page-item">
      <button  v-on:click="onClickFirstPage" :disabled="isInFirstPage"
        class="page-link" href="#" > « </button>
      
    </li>

    <li class="page-item">
      <button  v-on:click="onClickPreviousPage" :disabled="isInFirstPage"
         class="page-link" href="#">‹</button>
      
    </li>

    <li v-for="(page,index) in pages" v-bind:key="index" class="page-item">
      <button type="button" v-on:click="onClickPage(page.name)" :disabled="page.isDisabled" :class="{ active: isPageActive(page.name) }"
        class="page-link" href="#">{{ page.name}} </button>
     
    </li>

    <li class="page-item">
      <button type="button" v-on:click="onClickNextPage" :disabled="isInLastPage"
         class="page-link" href="#">›</button>
     
    </li>

    <li class="page-item">
      <button type="button" v-on:click="onClickLastPage" :disabled="isInLastPage"
        class="page-link" href="#">»</button>
      
    </li>
  </ul>
</div>
</template>

<script>
export default {
    name: 'pagination',
    props: {
        maxVisibleButtons: {
            type: Number,
            required: false,
            default: 3
        },
            totalPages: {
            type: Number,
            required: true
        },
            total: {
            type: Number,
            required: true
        },
            perPage: {
            type: Number,
            required: true
        },
            currentPage: {
            type: Number,
            required: true
        }
    },

    created(){
        console.log(this.total);
    },

    computed: {
    startPage() {
      // When on the first page
      if (this.currentPage === 1 )  {
        return 1;
      }
      // When on the last page
      if (this.currentPage === this.totalPages ) {
        return this.totalPages - this.maxVisibleButtons + 2;
      }
      // When in between
      return this.currentPage - 1;
    },
    endPage() {     
      return Math.min(this.startPage + this.maxVisibleButtons - 1, this.totalPages);  
    },
    pages() {
      const range = [];

      for (let i = this.startPage; i <= this.endPage; i+= 1 ) {
        range.push({
          name: i,
          isDisabled: i === this.currentPage 
        });
      }

      return range;
    },
    isInFirstPage() {
      return this.currentPage === 1;
    },
    isInLastPage() {
      return this.currentPage === this.totalPages;
    }
    },

  
    methods: {
    onClickFirstPage() {
      this.$emit('pagechanged', 1);
    },
    onClickPreviousPage() {
      this.$emit('pagechanged', this.currentPage - 1);
    },
    onClickPage(page) {
      this.$emit('pagechanged', page);
    },
    onClickNextPage() {
      this.$emit('pagechanged', this.currentPage + 1);
    },
    onClickLastPage() {
      this.$emit('pagechanged', this.totalPages);
    },
    isPageActive(page) {
      return this.currentPage === page;
    }
  }
}
</script>


<style>
.pagination {
  list-style-type: none;
}

.pagination-item {
  display: inline-block;
}

.active {
  background-color: #0c98f5;
  color: #ffffff;
}
</style>