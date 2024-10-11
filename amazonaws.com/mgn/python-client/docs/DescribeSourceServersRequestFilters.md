# DescribeSourceServersRequestFilters


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_ids** | **List** |  | [optional] 
**is_archived** | **bool** |  | [optional] 
**life_cycle_states** | **List** |  | [optional] 
**replication_types** | **List** |  | [optional] 
**source_server_ids** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.describe_source_servers_request_filters import DescribeSourceServersRequestFilters

# TODO update the JSON string below
json = "{}"
# create an instance of DescribeSourceServersRequestFilters from a JSON string
describe_source_servers_request_filters_instance = DescribeSourceServersRequestFilters.from_json(json)
# print the JSON string representation of the object
print(DescribeSourceServersRequestFilters.to_json())

# convert the object into a dict
describe_source_servers_request_filters_dict = describe_source_servers_request_filters_instance.to_dict()
# create an instance of DescribeSourceServersRequestFilters from a dict
describe_source_servers_request_filters_from_dict = DescribeSourceServersRequestFilters.from_dict(describe_source_servers_request_filters_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


