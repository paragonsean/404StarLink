# DescribeEndpointsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endpoints** | **List** |  | [optional] 
**next_token** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.describe_endpoints_response import DescribeEndpointsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DescribeEndpointsResponse from a JSON string
describe_endpoints_response_instance = DescribeEndpointsResponse.from_json(json)
# print the JSON string representation of the object
print(DescribeEndpointsResponse.to_json())

# convert the object into a dict
describe_endpoints_response_dict = describe_endpoints_response_instance.to_dict()
# create an instance of DescribeEndpointsResponse from a dict
describe_endpoints_response_from_dict = DescribeEndpointsResponse.from_dict(describe_endpoints_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


