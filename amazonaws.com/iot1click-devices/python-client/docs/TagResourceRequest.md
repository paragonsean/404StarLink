# TagResourceRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tags** | **Dict[str, str]** | &lt;p&gt;A collection of key/value pairs defining the resource tags. For example, {  \&quot;tags\&quot;: {\&quot;key1\&quot;: \&quot;value1\&quot;, \&quot;key2\&quot;: \&quot;value2\&quot;} }. For more information, see &lt;a href&#x3D;\&quot;https://aws.amazon.com/answers/account-management/aws-tagging-strategies/\&quot;&gt;AWS  Tagging Strategies&lt;/a&gt;.&lt;/p&gt;&lt;p&gt;    &lt;/p&gt; | 

## Example

```python
from openapi_client.models.tag_resource_request import TagResourceRequest

# TODO update the JSON string below
json = "{}"
# create an instance of TagResourceRequest from a JSON string
tag_resource_request_instance = TagResourceRequest.from_json(json)
# print the JSON string representation of the object
print(TagResourceRequest.to_json())

# convert the object into a dict
tag_resource_request_dict = tag_resource_request_instance.to_dict()
# create an instance of TagResourceRequest from a dict
tag_resource_request_from_dict = TagResourceRequest.from_dict(tag_resource_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


