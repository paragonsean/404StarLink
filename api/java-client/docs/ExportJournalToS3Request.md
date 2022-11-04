

# ExportJournalToS3Request


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**inclusiveStartTime** | **OffsetDateTime** | &lt;p&gt;The inclusive start date and time for the range of journal contents to export.&lt;/p&gt; &lt;p&gt;The &lt;code&gt;InclusiveStartTime&lt;/code&gt; must be in &lt;code&gt;ISO 8601&lt;/code&gt; date and time format and in Universal Coordinated Time (UTC). For example: &lt;code&gt;2019-06-13T21:36:34Z&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;The &lt;code&gt;InclusiveStartTime&lt;/code&gt; must be before &lt;code&gt;ExclusiveEndTime&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you provide an &lt;code&gt;InclusiveStartTime&lt;/code&gt; that is before the ledger&#39;s &lt;code&gt;CreationDateTime&lt;/code&gt;, Amazon QLDB defaults it to the ledger&#39;s &lt;code&gt;CreationDateTime&lt;/code&gt;.&lt;/p&gt; |  |
|**exclusiveEndTime** | **OffsetDateTime** | &lt;p&gt;The exclusive end date and time for the range of journal contents to export.&lt;/p&gt; &lt;p&gt;The &lt;code&gt;ExclusiveEndTime&lt;/code&gt; must be in &lt;code&gt;ISO 8601&lt;/code&gt; date and time format and in Universal Coordinated Time (UTC). For example: &lt;code&gt;2019-06-13T21:36:34Z&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;The &lt;code&gt;ExclusiveEndTime&lt;/code&gt; must be less than or equal to the current UTC date and time.&lt;/p&gt; |  |
|**s3ExportConfiguration** | [**ExportJournalToS3RequestS3ExportConfiguration**](ExportJournalToS3RequestS3ExportConfiguration.md) |  |  |
|**roleArn** | **String** | &lt;p&gt;The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal export job to do the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Write objects into your Amazon Simple Storage Service (Amazon S3) bucket.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;(Optional) Use your customer managed key in Key Management Service (KMS) for server-side encryption of your exported data.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;To pass a role to QLDB when requesting a journal export, you must have permissions to perform the &lt;code&gt;iam:PassRole&lt;/code&gt; action on the IAM role resource. This is required for all journal export requests.&lt;/p&gt; |  |
|**outputFormat** | [**OutputFormatEnum**](#OutputFormatEnum) | The output format of your exported journal data. If this parameter is not specified, the exported data defaults to &lt;code&gt;ION_TEXT&lt;/code&gt; format. |  [optional] |



## Enum: OutputFormatEnum

| Name | Value |
|---- | -----|
| ION_BINARY | &quot;ION_BINARY&quot; |
| ION_TEXT | &quot;ION_TEXT&quot; |
| JSON | &quot;JSON&quot; |



