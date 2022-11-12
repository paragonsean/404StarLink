# BusinessLines


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_lines** | [**List[BusinessLine]**](BusinessLine.md) | List of business lines. | 

## Example

```python
from openapi_client.models.business_lines import BusinessLines

# TODO update the JSON string below
json = "{}"
# create an instance of BusinessLines from a JSON string
business_lines_instance = BusinessLines.from_json(json)
# print the JSON string representation of the object
print(BusinessLines.to_json())

# convert the object into a dict
business_lines_dict = business_lines_instance.to_dict()
# create an instance of BusinessLines from a dict
business_lines_from_dict = BusinessLines.from_dict(business_lines_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


