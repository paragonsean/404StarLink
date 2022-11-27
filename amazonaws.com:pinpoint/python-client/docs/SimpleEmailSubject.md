# SimpleEmailSubject


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**charset** | **str** |  | [optional] 
**data** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.simple_email_subject import SimpleEmailSubject

# TODO update the JSON string below
json = "{}"
# create an instance of SimpleEmailSubject from a JSON string
simple_email_subject_instance = SimpleEmailSubject.from_json(json)
# print the JSON string representation of the object
print(SimpleEmailSubject.to_json())

# convert the object into a dict
simple_email_subject_dict = simple_email_subject_instance.to_dict()
# create an instance of SimpleEmailSubject from a dict
simple_email_subject_from_dict = SimpleEmailSubject.from_dict(simple_email_subject_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


