# DescribeVcenterClientsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | **List** |  | [optional] 
**next_token** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.describe_vcenter_clients_response import DescribeVcenterClientsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DescribeVcenterClientsResponse from a JSON string
describe_vcenter_clients_response_instance = DescribeVcenterClientsResponse.from_json(json)
# print the JSON string representation of the object
print(DescribeVcenterClientsResponse.to_json())

# convert the object into a dict
describe_vcenter_clients_response_dict = describe_vcenter_clients_response_instance.to_dict()
# create an instance of DescribeVcenterClientsResponse from a dict
describe_vcenter_clients_response_from_dict = DescribeVcenterClientsResponse.from_dict(describe_vcenter_clients_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


