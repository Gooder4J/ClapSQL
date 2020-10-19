import VueRouter from "vue-router"
import Index from "@/views/Index"
import Github from "@/views/Github";
import API from "@/views/API";
import SupportFeedback from "@/views/SupportFeedback";
import Tutorial from "@/views/Tutorial";
import MyMavonEditor from "@/views/MyMavonEditor";

const router = new VueRouter({
    routes: [
        {
            path: "/",
            component: Index
        },
        {
          path: "/tutorial",
          component: Tutorial
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
            component: SupportFeedback
        },
        {
            path: "/administrator/md",
            component: MyMavonEditor
        }
    ]
})

export default router
