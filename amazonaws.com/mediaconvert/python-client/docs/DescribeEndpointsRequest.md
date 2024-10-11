# DescribeEndpointsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**max_results** | **int** | Optional. Max number of endpoints, up to twenty, that will be returned at one time. | [optional] 
**mode** | **str** | Optional field, defaults to DEFAULT. Specify DEFAULT for this operation to return your endpoints if any exist, or to create an endpoint for you and return it if one doesn&#39;t already exist. Specify GET_ONLY to return your endpoints if any exist, or an empty list if none exist. | [optional] 
**next_token** | **str** | Use this string, provided with the response to a previous request, to request the next batch of endpoints. | [optional] 

## Example

```python
from openapi_client.models.describe_endpoints_request import DescribeEndpointsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of DescribeEndpointsRequest from a JSON string
describe_endpoints_request_instance = DescribeEndpointsRequest.from_json(json)
# print the JSON string representation of the object
print(DescribeEndpointsRequest.to_json())

# convert the object into a dict
describe_endpoints_request_dict = describe_endpoints_request_instance.to_dict()
# create an instance of DescribeEndpointsRequest from a dict
describe_endpoints_request_from_dict = DescribeEndpointsRequest.from_dict(describe_endpoints_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


