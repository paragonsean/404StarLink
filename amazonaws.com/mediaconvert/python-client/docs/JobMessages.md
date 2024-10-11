# JobMessages


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**info** | **List** |  | [optional] 
**warning** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.job_messages import JobMessages

# TODO update the JSON string below
json = "{}"
# create an instance of JobMessages from a JSON string
job_messages_instance = JobMessages.from_json(json)
# print the JSON string representation of the object
print(JobMessages.to_json())

# convert the object into a dict
job_messages_dict = job_messages_instance.to_dict()
# create an instance of JobMessages from a dict
job_messages_from_dict = JobMessages.from_dict(job_messages_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


