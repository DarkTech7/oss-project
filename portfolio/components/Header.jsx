import React from 'react'

function Header() {
  return (
    <div className='overflow-hidden bg-gray-100'>
      <ul className='flex items-center justify-center py-6'>
        <li className='text-base mx-5 font-semibold font-serif hover:text-green-500 ease-in-out delay-200'>Home</li>
        <li className='text-base mx-5 font-semibold font-serif hover:text-green-500 ease-in-out delay-200'>Services</li>
        <li className='text-base mx-5 font-semibold font-serif hover:text-green-500 ease-in-out delay-200'>About</li>
        <li className='text-base mx-5 font-semibold font-serif hover:text-green-500 ease-in-out delay-200'>Portfolio</li>
        <li className='text-base mx-5 font-semibold font-serif hover:text-green-500 ease-in-out delay-200'>Client</li>
        <li className='text-base mx-5 font-semibold font-serif hover:text-green-500 ease-in-out delay-200'>Contact</li>
      </ul>
    </div>
  )
}

export default Header