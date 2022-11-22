# CreateFuotaTaskResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arn** | **str** | The arn of a FUOTA task. | [optional] 
**id** | **str** | The ID of a FUOTA task. | [optional] 

## Example

```python
from openapi_client.models.create_fuota_task_response import CreateFuotaTaskResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CreateFuotaTaskResponse from a JSON string
create_fuota_task_response_instance = CreateFuotaTaskResponse.from_json(json)
# print the JSON string representation of the object
print(CreateFuotaTaskResponse.to_json())

# convert the object into a dict
create_fuota_task_response_dict = create_fuota_task_response_instance.to_dict()
# create an instance of CreateFuotaTaskResponse from a dict
create_fuota_task_response_from_dict = CreateFuotaTaskResponse.from_dict(create_fuota_task_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


