# ListBuildsResponse

Response including listed builds.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**builds** | [**List[Build]**](Build.md) | Builds will be sorted by &#x60;create_time&#x60;, descending. | [optional] 
**next_page_token** | **str** | Token to receive the next page of results. This will be absent if the end of the response list has been reached. | [optional] 

## Example

```python
from openapi_client.models.list_builds_response import ListBuildsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListBuildsResponse from a JSON string
list_builds_response_instance = ListBuildsResponse.from_json(json)
# print the JSON string representation of the object
print(ListBuildsResponse.to_json())

# convert the object into a dict
list_builds_response_dict = list_builds_response_instance.to_dict()
# create an instance of ListBuildsResponse from a dict
list_builds_response_from_dict = ListBuildsResponse.from_dict(list_builds_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


