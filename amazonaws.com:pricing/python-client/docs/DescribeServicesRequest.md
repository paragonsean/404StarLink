# DescribeServicesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**service_code** | **str** |  | [optional] 
**format_version** | **str** |  | [optional] 
**next_token** | **str** |  | [optional] 
**max_results** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.describe_services_request import DescribeServicesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of DescribeServicesRequest from a JSON string
describe_services_request_instance = DescribeServicesRequest.from_json(json)
# print the JSON string representation of the object
print(DescribeServicesRequest.to_json())

# convert the object into a dict
describe_services_request_dict = describe_services_request_instance.to_dict()
# create an instance of DescribeServicesRequest from a dict
describe_services_request_from_dict = DescribeServicesRequest.from_dict(describe_services_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


