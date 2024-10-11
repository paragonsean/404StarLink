# DescribeSourceServersResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | **List** |  | [optional] 
**next_token** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.describe_source_servers_response import DescribeSourceServersResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DescribeSourceServersResponse from a JSON string
describe_source_servers_response_instance = DescribeSourceServersResponse.from_json(json)
# print the JSON string representation of the object
print(DescribeSourceServersResponse.to_json())

# convert the object into a dict
describe_source_servers_response_dict = describe_source_servers_response_instance.to_dict()
# create an instance of DescribeSourceServersResponse from a dict
describe_source_servers_response_from_dict = DescribeSourceServersResponse.from_dict(describe_source_servers_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


