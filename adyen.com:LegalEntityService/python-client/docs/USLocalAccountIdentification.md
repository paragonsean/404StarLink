# USLocalAccountIdentification


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_number** | **str** | The bank account number, without separators or whitespace. | 
**account_type** | **str** | The bank account type.  Possible values: **checking** or **savings**. Defaults to **checking**. | [optional] [default to 'checking']
**routing_number** | **str** | The 9-digit [routing number](https://en.wikipedia.org/wiki/ABA_routing_transit_number), without separators or whitespace. | 
**type** | **str** | **usLocal** | [default to 'usLocal']

## Example

```python
from openapi_client.models.us_local_account_identification import USLocalAccountIdentification

# TODO update the JSON string below
json = "{}"
# create an instance of USLocalAccountIdentification from a JSON string
us_local_account_identification_instance = USLocalAccountIdentification.from_json(json)
# print the JSON string representation of the object
print(USLocalAccountIdentification.to_json())

# convert the object into a dict
us_local_account_identification_dict = us_local_account_identification_instance.to_dict()
# create an instance of USLocalAccountIdentification from a dict
us_local_account_identification_from_dict = USLocalAccountIdentification.from_dict(us_local_account_identification_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


