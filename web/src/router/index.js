import {createRouter, createWebHistory} from 'vue-router'
import Home from "../view/home.vue"
import Login from "../view/login.vue";
// import Login from "../view/login.vue";
// import Register from "../view/register.vue";
// import Reset from "../view/reset.vue"
// import Welcome from "../view/home/welcome.vue"
// import Help from "../view/home/help.vue";
// import Filetrans from "../view/home/filetrans.vue";

const routes = [{
  path: "/home",
  component: Home
},
  {
    path: "/login",
    component: Login
  }]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router
