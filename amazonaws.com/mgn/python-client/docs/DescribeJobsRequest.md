# DescribeJobsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filters** | [**DescribeJobsRequestFilters**](DescribeJobsRequestFilters.md) |  | [optional] 
**max_results** | **int** | Request to describe job log items by max results. | [optional] 
**next_token** | **str** | Request to describe job log items by next token. | [optional] 

## Example

```python
from openapi_client.models.describe_jobs_request import DescribeJobsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of DescribeJobsRequest from a JSON string
describe_jobs_request_instance = DescribeJobsRequest.from_json(json)
# print the JSON string representation of the object
print(DescribeJobsRequest.to_json())

# convert the object into a dict
describe_jobs_request_dict = describe_jobs_request_instance.to_dict()
# create an instance of DescribeJobsRequest from a dict
describe_jobs_request_from_dict = DescribeJobsRequest.from_dict(describe_jobs_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


