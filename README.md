
**Coroutine TESTING <=====**

1. **How to run simple suspend function in test file?**                   ==>  Use runTest{} builder that is from coroutineTest library
2. **When we add GlobalScope.launch(Dispatcher.Any)
   in code, then that code runs on provided thread pool.
   Test cases donot run on a thread. How to achieve this**                ==> Use StandardThreadDispatcher() object
                                                                          ==> Dispatchers.setMain(stdObj)     Now on this any thread pool can run 
3. **Do we need to add StandardThreadDispatcher for every class?**        ==> No, You can create a class, extend it with TestWatcher() class and implement its two methods
                                                                          starting,finish. Create and destroy object in these. Access stdObj from this class
5. **Will code execute complete in a launcher? or will it move
   to next line after running coroutine?**                                ==> As coroutine builder ran, code will ran on a coroutine. And before this next line (Out of dispatcher)
                                                                          will run. So if we want to execute coroutine code first and then move forward we use advanceUntilIdle
