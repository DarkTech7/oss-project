import React from 'react'

function MyServices() {
  return (
    <div className='flex flex-col font-medium items-center h-screen'>
        <h1 className='text-4xl'>
        My Services
        </h1>
        <div className='flex max-w-6xl justify-center gap-9 p-5 flex-wrap my-5'>
            {/*  */}
        <div className='flex w-[450px] shadow-sm hover:shadow-md px-6 py-3 rounded-sm'>
            <div className='w-1/5'>
                <div className='h-10 w-10 bg-red-500 rounded-full'></div>    
            </div> 

            <div className='w-4/5'>
                <h1>UI/UX Designer</h1>
                <p className='text-gray-500'>Lorem ipsum dolor sit amet consectetur adipisicing elit. Minus asperiores quidem, molestiae magni blanditiis nesciunt corrupti quod doloremque eum ut?</p>
            </div>
        </div>
        <div className='flex w-[450px] shadow-sm hover:shadow-md px-6 py-3 rounded-sm'>
            <div className='w-1/5'>
                <div className='h-10 w-10 bg-red-500 rounded-full'></div>    
            </div> 

            <div className='w-4/5'>
                <h1>Web Development</h1>
                <p className='text-gray-500'>Lorem ipsum dolor sit amet consectetur adipisicing elit. Minus asperiores quidem, molestiae magni blanditiis nesciunt corrupti quod doloremque eum ut?</p>
            </div>
        </div>
        <div className='flex w-[450px] shadow-sm hover:shadow-md px-6 py-3 rounded-sm'>
            <div className='w-1/5'>
                <div className='h-10 w-10 bg-red-500 rounded-full'></div>    
            </div> 

            <div className='w-4/5'>
                <h1>Brand & Logo Design</h1>
                <p className='text-gray-500'>Lorem ipsum dolor sit amet consectetur adipisicing elit. Minus asperiores quidem, molestiae magni blanditiis nesciunt corrupti quod doloremque eum ut?</p>
            </div>
        </div>
        <div className='flex w-[450px] shadow-sm hover:shadow-md px-6 py-3 rounded-sm'>
            <div className='w-1/5'>
                <div className='h-10 w-10 bg-red-500 rounded-full'></div>    
            </div> 

            <div className='w-4/5'>
                <h1>Web Design</h1>
                <p className='text-gray-500'>Lorem ipsum dolor sit amet consectetur adipisicing elit. Minus asperiores quidem, molestiae magni blanditiis nesciunt corrupti quod doloremque eum ut?</p>
            </div>
        </div>


            {/*  */}
        </div>

    </div>
  )
}

export default MyServices