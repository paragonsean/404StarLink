# DescribeTableRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cluster_identifier** | **str** |  | [optional] 
**connected_database** | **str** |  | [optional] 
**database** | **str** |  | 
**db_user** | **str** |  | [optional] 
**max_results** | **int** |  | [optional] 
**next_token** | **str** |  | [optional] 
**var_schema** | **str** |  | [optional] 
**secret_arn** | **str** |  | [optional] 
**table** | **str** |  | [optional] 
**workgroup_name** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.describe_table_request import DescribeTableRequest

# TODO update the JSON string below
json = "{}"
# create an instance of DescribeTableRequest from a JSON string
describe_table_request_instance = DescribeTableRequest.from_json(json)
# print the JSON string representation of the object
print(DescribeTableRequest.to_json())

# convert the object into a dict
describe_table_request_dict = describe_table_request_instance.to_dict()
# create an instance of DescribeTableRequest from a dict
describe_table_request_from_dict = DescribeTableRequest.from_dict(describe_table_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


