

# ListTableRowsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rowIds** | **List&lt;String&gt;** |  This parameter is optional. If one or more row ids are specified in this list, then only the specified row ids are returned in the result. If no row ids are specified here, then all the rows in the table are returned.  |  [optional] |
|**maxResults** | **Integer** | The maximum number of rows to return in each page of the results. |  [optional] |
|**nextToken** | **String** | &lt;p&gt; This parameter is optional. If a nextToken is not specified, the API returns the first page of data. &lt;/p&gt; &lt;p&gt; Pagination tokens expire after 1 hour. If you use a token that was returned more than an hour back, the API will throw ValidationException. &lt;/p&gt; |  [optional] |



