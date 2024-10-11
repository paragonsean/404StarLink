# ListApplicationsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filters** | [**ListApplicationsRequestFilters**](ListApplicationsRequestFilters.md) |  | [optional] 
**max_results** | **int** | Maximum results to return when listing applications. | [optional] 
**next_token** | **str** | Request next token. | [optional] 

## Example

```python
from openapi_client.models.list_applications_request import ListApplicationsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ListApplicationsRequest from a JSON string
list_applications_request_instance = ListApplicationsRequest.from_json(json)
# print the JSON string representation of the object
print(ListApplicationsRequest.to_json())

# convert the object into a dict
list_applications_request_dict = list_applications_request_instance.to_dict()
# create an instance of ListApplicationsRequest from a dict
list_applications_request_from_dict = ListApplicationsRequest.from_dict(list_applications_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


