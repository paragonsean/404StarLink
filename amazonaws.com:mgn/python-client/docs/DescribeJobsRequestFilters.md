# DescribeJobsRequestFilters


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from_date** | **str** |  | [optional] 
**job_ids** | **List** |  | [optional] 
**to_date** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.describe_jobs_request_filters import DescribeJobsRequestFilters

# TODO update the JSON string below
json = "{}"
# create an instance of DescribeJobsRequestFilters from a JSON string
describe_jobs_request_filters_instance = DescribeJobsRequestFilters.from_json(json)
# print the JSON string representation of the object
print(DescribeJobsRequestFilters.to_json())

# convert the object into a dict
describe_jobs_request_filters_dict = describe_jobs_request_filters_instance.to_dict()
# create an instance of DescribeJobsRequestFilters from a dict
describe_jobs_request_filters_from_dict = DescribeJobsRequestFilters.from_dict(describe_jobs_request_filters_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


