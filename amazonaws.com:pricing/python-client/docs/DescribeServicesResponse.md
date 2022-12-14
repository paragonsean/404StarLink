# DescribeServicesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**services** | **List** |  | [optional] 
**format_version** | **str** |  | [optional] 
**next_token** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.describe_services_response import DescribeServicesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DescribeServicesResponse from a JSON string
describe_services_response_instance = DescribeServicesResponse.from_json(json)
# print the JSON string representation of the object
print(DescribeServicesResponse.to_json())

# convert the object into a dict
describe_services_response_dict = describe_services_response_instance.to_dict()
# create an instance of DescribeServicesResponse from a dict
describe_services_response_from_dict = DescribeServicesResponse.from_dict(describe_services_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


