# Submit

Submit the specified form. This action is useful for forms without explicit submit buttons, such as single-input Search forms.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**selector** | **str** | Must be an any valid CSS Selector inside the parent form to submit. | [optional] 

## Example

```python
from openapi_client.models.submit import Submit

# TODO update the JSON string below
json = "{}"
# create an instance of Submit from a JSON string
submit_instance = Submit.from_json(json)
# print the JSON string representation of the object
print(Submit.to_json())

# convert the object into a dict
submit_dict = submit_instance.to_dict()
# create an instance of Submit from a dict
submit_from_dict = Submit.from_dict(submit_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


