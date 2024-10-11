

# BatchUpsertTableRowsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rowsToUpsert** | [**List&lt;UpsertRowData&gt;**](UpsertRowData.md) | &lt;p&gt; The list of rows to upsert in the table. Each item in this list needs to have a batch item id to uniquely identify the element in the request, a filter expression to find the rows to update for that element and the cell values to set for each column in the upserted rows. You need to specify at least one item in this list. &lt;/p&gt; &lt;p&gt; Note that if one of the filter formulas in the request fails to evaluate because of an error or one of the column ids in any of the rows does not exist in the table, then the request fails and no updates are made to the table. &lt;/p&gt; |  |
|**clientRequestToken** | **String** | &lt;p&gt; The request token for performing the update action. Request tokens help to identify duplicate requests. If a call times out or fails due to a transient error like a failed network connection, you can retry the call with the same request token. The service ensures that if the first call using that request token is successfully performed, the second call will not perform the action again. &lt;/p&gt; &lt;p&gt; Note that request tokens are valid only for a few minutes. You cannot use request tokens to dedupe requests spanning hours or days. &lt;/p&gt; |  [optional] |



