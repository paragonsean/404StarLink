

# BatchDeleteTableRowsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rowIds** | **List&lt;String&gt;** | &lt;p&gt; The list of row ids to delete from the table. You need to specify at least one row id in this list. &lt;/p&gt; &lt;p&gt; Note that if one of the row ids provided in the request does not exist in the table, then the request fails and no rows are deleted from the table. &lt;/p&gt; |  |
|**clientRequestToken** | **String** | &lt;p&gt; The request token for performing the delete action. Request tokens help to identify duplicate requests. If a call times out or fails due to a transient error like a failed network connection, you can retry the call with the same request token. The service ensures that if the first call using that request token is successfully performed, the second call will not perform the action again. &lt;/p&gt; &lt;p&gt; Note that request tokens are valid only for a few minutes. You cannot use request tokens to dedupe requests spanning hours or days. &lt;/p&gt; |  [optional] |



