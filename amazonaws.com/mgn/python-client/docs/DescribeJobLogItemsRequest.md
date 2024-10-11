# DescribeJobLogItemsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**job_id** | **str** | Request to describe Job log job ID. | 
**max_results** | **int** | Request to describe Job log item maximum results. | [optional] 
**next_token** | **str** | Request to describe Job log next token. | [optional] 

## Example

```python
from openapi_client.models.describe_job_log_items_request import DescribeJobLogItemsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of DescribeJobLogItemsRequest from a JSON string
describe_job_log_items_request_instance = DescribeJobLogItemsRequest.from_json(json)
# print the JSON string representation of the object
print(DescribeJobLogItemsRequest.to_json())

# convert the object into a dict
describe_job_log_items_request_dict = describe_job_log_items_request_instance.to_dict()
# create an instance of DescribeJobLogItemsRequest from a dict
describe_job_log_items_request_from_dict = DescribeJobLogItemsRequest.from_dict(describe_job_log_items_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


