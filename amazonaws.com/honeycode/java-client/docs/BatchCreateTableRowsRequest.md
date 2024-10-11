

# BatchCreateTableRowsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rowsToCreate** | [**List&lt;CreateRowData&gt;**](CreateRowData.md) | &lt;p&gt; The list of rows to create at the end of the table. Each item in this list needs to have a batch item id to uniquely identify the element in the request and the cells to create for that row. You need to specify at least one item in this list. &lt;/p&gt; &lt;p&gt; Note that if one of the column ids in any of the rows in the request does not exist in the table, then the request fails and no updates are made to the table. &lt;/p&gt; |  |
|**clientRequestToken** | **String** | &lt;p&gt; The request token for performing the batch create operation. Request tokens help to identify duplicate requests. If a call times out or fails due to a transient error like a failed network connection, you can retry the call with the same request token. The service ensures that if the first call using that request token is successfully performed, the second call will not perform the operation again. &lt;/p&gt; &lt;p&gt; Note that request tokens are valid only for a few minutes. You cannot use request tokens to dedupe requests spanning hours or days. &lt;/p&gt; |  [optional] |



