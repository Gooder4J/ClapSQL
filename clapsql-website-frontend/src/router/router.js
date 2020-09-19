import VueRouter from "vue-router"
import Index from "@/views/Index"
import Github from "@/views/Github";
import API from "@/views/API";
import SuportFeedback from "@/views/SuportFeedback";

const router = new VueRouter({
    routes: [
        {
            path: "/",
            component: Index
        },
        {
          path: "/api",
          component: API
        },
        {
            path: "/github",
            component: Github
        },
        {
            path: "/support-feedback",
            component: SuportFeedback
        }
    ]
})

export default router
