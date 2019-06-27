<template>
<div>
  <Nav></Nav>
  <form>
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="text" class="form-control" v-model="email" id="email" placeholder="Enter email">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" v-model="password" placeholder="Enter password">
    </div>
    <div class="checkbox">
      <label><input type="checkbox"> Recommon me</label>
    </div>
    <button type="button" class="btn btn-default" @click="get()">GET</button>
    <button type="button" class="btn btn-default" @click="post()">POST</button>
    <button type="button" class="btn btn-default" @click="put()">PUT</button>
    <button type="button" class="btn btn-default" @click="remove()">DELETE</button>
  </form>
  <Footer></Footer>
</div>
</template>

<script>
import Nav from '@/components/common/Nav.vue'
import Footer from'@/components/common/Footer.vue'
import axios from 'axios'

export default {
  data(){
    return{
      email:'',
      password:''
    }
  },
  components: {
    Nav,
    Footer
  },
  methods:{
    get:function(){
      alert('되냐?')
      axios.get('/customers/count').then(d=>{
        alert(`SUCCESS:${d.data}`)
      })
      .catch(e=>{
        alert('ERROR')
      })
    },post:function(){
      alert('되냐?')
      axios.post('/customers').then(d=>{
        alert(`SUCCESS:${d.data}`)
      }).catch(e=>{
        alert('ERROR')
      });
    },put:function(){
      alert('되냐?')
      axios.put('/customers/modify').then(d=>{
        alert(`SUCCESS:${d.data}`)
      }).catch(e=>{
        alert('ERROR')

      });
    },remove:function(){
      alert('되냐?')
      axios.delete('/customers/delete').then(d=>{
        alert(`SUCCESS:${d.data}`)
      }).catch(e=>{
        alert('ERROR')
    })
    }

  }
}
</script>

<style scoped>
</style>
