import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
import Caculator from '@/components/basic/Caculator'
import JoinForm from '@/components/member/JoinForm'
import LoginForm from '@/components/member/LoginForm'
import MemberList from '@/components/member/MemberList'
import Chatbot from '@/components/basic/Chatbot'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {path: '/chatbot',name:'chatbot',component:Chatbot},
    {path: '/memberlist',name:'memberlist',component:MemberList},
    {path: '/loginform', name: 'loginform', component: LoginForm},
    {path: '/', name: 'home', component: Home},
    {path: '/calculator', name: 'calculator', component: Caculator},
    {path: '/joinform', name: 'joinform', component: JoinForm}
  ]
})
