

# StreamJournalToKinesisRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**roleArn** | **String** | &lt;p&gt;The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal stream to write data records to a Kinesis Data Streams resource.&lt;/p&gt; &lt;p&gt;To pass a role to QLDB when requesting a journal stream, you must have permissions to perform the &lt;code&gt;iam:PassRole&lt;/code&gt; action on the IAM role resource. This is required for all journal stream requests.&lt;/p&gt; |  |
|**tags** | **Map&lt;String, String&gt;** | The key-value pairs to add as tags to the stream that you want to create. Tag keys are case sensitive. Tag values are case sensitive and can be null. |  [optional] |
|**inclusiveStartTime** | **OffsetDateTime** | &lt;p&gt;The inclusive start date and time from which to start streaming journal data. This parameter must be in &lt;code&gt;ISO 8601&lt;/code&gt; date and time format and in Universal Coordinated Time (UTC). For example: &lt;code&gt;2019-06-13T21:36:34Z&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;The &lt;code&gt;InclusiveStartTime&lt;/code&gt; cannot be in the future and must be before &lt;code&gt;ExclusiveEndTime&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you provide an &lt;code&gt;InclusiveStartTime&lt;/code&gt; that is before the ledger&#39;s &lt;code&gt;CreationDateTime&lt;/code&gt;, QLDB effectively defaults it to the ledger&#39;s &lt;code&gt;CreationDateTime&lt;/code&gt;.&lt;/p&gt; |  |
|**exclusiveEndTime** | **OffsetDateTime** | &lt;p&gt;The exclusive date and time that specifies when the stream ends. If you don&#39;t define this parameter, the stream runs indefinitely until you cancel it.&lt;/p&gt; &lt;p&gt;The &lt;code&gt;ExclusiveEndTime&lt;/code&gt; must be in &lt;code&gt;ISO 8601&lt;/code&gt; date and time format and in Universal Coordinated Time (UTC). For example: &lt;code&gt;2019-06-13T21:36:34Z&lt;/code&gt;.&lt;/p&gt; |  [optional] |
|**kinesisConfiguration** | [**StreamJournalToKinesisRequestKinesisConfiguration**](StreamJournalToKinesisRequestKinesisConfiguration.md) |  |  |
|**streamName** | **String** | &lt;p&gt;The name that you want to assign to the QLDB journal stream. User-defined names can help identify and indicate the purpose of a stream.&lt;/p&gt; &lt;p&gt;Your stream name must be unique among other &lt;i&gt;active&lt;/i&gt; streams for a given ledger. Stream names have the same naming constraints as ledger names, as defined in &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/qldb/latest/developerguide/limits.html#limits.naming\&quot;&gt;Quotas in Amazon QLDB&lt;/a&gt; in the &lt;i&gt;Amazon QLDB Developer Guide&lt;/i&gt;.&lt;/p&gt; |  |



