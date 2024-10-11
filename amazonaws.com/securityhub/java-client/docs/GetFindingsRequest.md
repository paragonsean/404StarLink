

# GetFindingsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**filters** | [**CreateInsightRequestFilters**](CreateInsightRequestFilters.md) |  |  [optional] |
|**sortCriteria** | [**List&lt;SortCriterion&gt;**](SortCriterion.md) | The finding attributes used to sort the list of returned findings. |  [optional] |
|**nextToken** | **String** | &lt;p&gt;The token that is required for pagination. On your first call to the &lt;code&gt;GetFindings&lt;/code&gt; operation, set the value of this parameter to &lt;code&gt;NULL&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;For subsequent calls to the operation, to continue listing data, set the value of this parameter to the value returned from the previous response.&lt;/p&gt; |  [optional] |
|**maxResults** | **Integer** | The maximum number of findings to return. |  [optional] |



