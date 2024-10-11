

# GetInsightsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**insightArns** | **List&lt;String&gt;** | The ARNs of the insights to describe. If you do not provide any insight ARNs, then &lt;code&gt;GetInsights&lt;/code&gt; returns all of your custom insights. It does not return any managed insights. |  [optional] |
|**nextToken** | **String** | &lt;p&gt;The token that is required for pagination. On your first call to the &lt;code&gt;GetInsights&lt;/code&gt; operation, set the value of this parameter to &lt;code&gt;NULL&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;For subsequent calls to the operation, to continue listing data, set the value of this parameter to the value returned from the previous response.&lt;/p&gt; |  [optional] |
|**maxResults** | **Integer** | The maximum number of items to return in the response. |  [optional] |



