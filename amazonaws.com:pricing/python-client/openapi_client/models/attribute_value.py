# coding: utf-8

"""
    AWS Price List Service

    <p>Amazon Web Services Price List API is a centralized and convenient way to programmatically query Amazon Web Services for services, products, and pricing information. The Amazon Web Services Price List uses standardized product attributes such as <code>Location</code>, <code>Storage Class</code>, and <code>Operating System</code>, and provides prices at the SKU level. You can use the Amazon Web Services Price List to build cost control and scenario planning tools, reconcile billing data, forecast future spend for budgeting purposes, and provide cost benefit analysis that compare your internal workloads with Amazon Web Services.</p> <p>Use <code>GetServices</code> without a service code to retrieve the service codes for all AWS services, then <code>GetServices</code> with a service code to retrieve the attribute names for that service. After you have the service code and attribute names, you can use <code>GetAttributeValues</code> to see what values are available for an attribute. With the service code and an attribute name and value, you can use <code>GetProducts</code> to find specific products that you're interested in, such as an <code>AmazonEC2</code> instance, with a <code>Provisioned IOPS</code> <code>volumeType</code>.</p> <p>Service Endpoint</p> <p>Amazon Web Services Price List service API provides the following two endpoints:</p> <ul> <li> <p>https://api.pricing.us-east-1.amazonaws.com</p> </li> <li> <p>https://api.pricing.ap-south-1.amazonaws.com</p> </li> </ul>

    The version of the OpenAPI document: 2017-10-15
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class AttributeValue(BaseModel):
    """
    The values of a given attribute, such as <code>Throughput Optimized HDD</code> or <code>Provisioned IOPS</code> for the <code>Amazon EC2</code> <code>volumeType</code> attribute.
    """ # noqa: E501
    value: Optional[Any] = Field(default=None, alias="Value")
    __properties: ClassVar[List[str]] = ["Value"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of AttributeValue from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of AttributeValue from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "Value": obj.get("Value")
        })
        return _obj


