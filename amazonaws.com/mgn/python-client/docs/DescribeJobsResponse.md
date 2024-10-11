# DescribeJobsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | **List** |  | [optional] 
**next_token** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.describe_jobs_response import DescribeJobsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DescribeJobsResponse from a JSON string
describe_jobs_response_instance = DescribeJobsResponse.from_json(json)
# print the JSON string representation of the object
print(DescribeJobsResponse.to_json())

# convert the object into a dict
describe_jobs_response_dict = describe_jobs_response_instance.to_dict()
# create an instance of DescribeJobsResponse from a dict
describe_jobs_response_from_dict = DescribeJobsResponse.from_dict(describe_jobs_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


