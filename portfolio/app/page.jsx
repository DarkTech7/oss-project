import About from "@/components/About";
import Header from "@/components/Header";
import MainBody from "@/components/MainBody";
import MyServices from "@/components/MyServices";


export default function Home() {
  return (
    <>
    <div className="w-[100%]">
      <Header/>
      <MainBody/>
      <MyServices/>
      <About/>
    </div>
    </>
  )
}
