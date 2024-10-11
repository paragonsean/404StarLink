# BirthData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date_of_birth** | **str** | The individual&#39;s date of birth, in YYYY-MM-DD format. | [optional] 

## Example

```python
from openapi_client.models.birth_data import BirthData

# TODO update the JSON string below
json = "{}"
# create an instance of BirthData from a JSON string
birth_data_instance = BirthData.from_json(json)
# print the JSON string representation of the object
print(BirthData.to_json())

# convert the object into a dict
birth_data_dict = birth_data_instance.to_dict()
# create an instance of BirthData from a dict
birth_data_from_dict = BirthData.from_dict(birth_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


