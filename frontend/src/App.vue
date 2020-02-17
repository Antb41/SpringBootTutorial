<template>
  <div id="app">
    <h1>{{ title }}</h1>
  </div>
</template>

<script>
export default {
  name: "app",
  data(){
    return{
      title: ""
    };
  },
//reach out to back end application and display text on page
  mounted(){
    //make sure you use correct backend port number
    fetch("http://localhost:8085")
      .then(response => {
        return response.text();
      })
      .then(data => {
        this.title = data;
      });
  }
};
</script>

