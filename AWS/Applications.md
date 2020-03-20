## Applications

### SQS

A webservice that gives you access to a message queue that can be used to store messages while waiting for a computer to process them.

It's a distributed queue system taht enables web service applications to quickly and reliably queue messages that one component in the application generates to be consumed by anoterh conponent.

A queue is a temporary repository for messsages that are awaiting processing.

Using amazon SQS, you can decouple the components of an application so they run independently, easing message management between conponents.

Any component of a distributed application can store messages in a fail-safe queue.

Messages can contain up to 256KB of text in any format Any component can later retrieve the messages programmatically using the Amazon SQS API.

The queue acts as a buffer between the component producing and saving data, and the component receiving athe data for processing.

This means the queue resolves issues that arise if the producer is producing work faster than the consumer can process it, or if the producer or consumer are only intermittently connected to the network.

#### Standard queues

 - The default queue type
 - Very high tps
 - Messages generally arrive in order
 - Messages can arrive out of order
 - Messages can be duplicated
 
#### FIFO (first in first out)

- 300 TPS max
- no dupes
- always in order
- allow message groups that allow multiple ordered message groups within a single queue

### SQS exam tips
- SQS is pull-based not pushed-based -> this means that ec2 instances have to send requests to an api to get the messages.
- Messages are 256kb in size (kind of)
- messages can be kept in the queue from 1 min to 14 days; the default retention period is 4 days.
- Visibility timeout is the amount of time that the message is invisible in the SQS queue after a reader picks up that message. Provided the job is processsed before the visibility timeout expires, the message will then be deleted from the queue. If the job is not processsed within that time, the message will become visible again and another reader will process it. THis could result in the same message being delivered twice.
- Visibility timeout max is 12 hours
- SQS guarantees that your message will be processed at least once.
- Amazon SQS long polling is a way to retrieve messages from you Aazon SQS queues. While the regular short polling returns immediately (even if the message queue being polled is empty), long polling doesn't return a response until a message arrives in the message queue, or the long pill times out.
- Any time you see a scenario based question about "decoupling" your ingra structure think SQS.






