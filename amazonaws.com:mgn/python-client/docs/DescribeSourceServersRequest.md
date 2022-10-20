# DescribeSourceServersRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filters** | [**DescribeSourceServersRequestFilters**](DescribeSourceServersRequestFilters.md) |  | [optional] 
**max_results** | **int** | Request to filter Source Servers list by maximum results. | [optional] 
**next_token** | **str** | Request to filter Source Servers list by next token. | [optional] 

## Example

```python
from openapi_client.models.describe_source_servers_request import DescribeSourceServersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of DescribeSourceServersRequest from a JSON string
describe_source_servers_request_instance = DescribeSourceServersRequest.from_json(json)
# print the JSON string representation of the object
print(DescribeSourceServersRequest.to_json())

# convert the object into a dict
describe_source_servers_request_dict = describe_source_servers_request_instance.to_dict()
# create an instance of DescribeSourceServersRequest from a dict
describe_source_servers_request_from_dict = DescribeSourceServersRequest.from_dict(describe_source_servers_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


