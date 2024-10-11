# DeleteJobRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**job_id** | **str** | Request to delete Job from service by Job ID. | 

## Example

```python
from openapi_client.models.delete_job_request import DeleteJobRequest

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteJobRequest from a JSON string
delete_job_request_instance = DeleteJobRequest.from_json(json)
# print the JSON string representation of the object
print(DeleteJobRequest.to_json())

# convert the object into a dict
delete_job_request_dict = delete_job_request_instance.to_dict()
# create an instance of DeleteJobRequest from a dict
delete_job_request_from_dict = DeleteJobRequest.from_dict(delete_job_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


