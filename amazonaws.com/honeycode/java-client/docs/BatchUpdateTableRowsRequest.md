

# BatchUpdateTableRowsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rowsToUpdate** | [**List&lt;UpdateRowData&gt;**](UpdateRowData.md) | &lt;p&gt; The list of rows to update in the table. Each item in this list needs to contain the row id to update along with the map of column id to cell values for each column in that row that needs to be updated. You need to specify at least one row in this list, and for each row, you need to specify at least one column to update. &lt;/p&gt; &lt;p&gt; Note that if one of the row or column ids in the request does not exist in the table, then the request fails and no updates are made to the table. &lt;/p&gt; |  |
|**clientRequestToken** | **String** | &lt;p&gt; The request token for performing the update action. Request tokens help to identify duplicate requests. If a call times out or fails due to a transient error like a failed network connection, you can retry the call with the same request token. The service ensures that if the first call using that request token is successfully performed, the second call will not perform the action again. &lt;/p&gt; &lt;p&gt; Note that request tokens are valid only for a few minutes. You cannot use request tokens to dedupe requests spanning hours or days. &lt;/p&gt; |  [optional] |



