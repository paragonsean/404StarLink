# coding: utf-8

"""
    eBay Finances API

    This API is used to retrieve seller payouts and monetary transaction details related to those payouts.

    The version of the OpenAPI document: v1.15.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class Reference(BaseModel):
    """
    This field is returned for NON_SALE_CHARGE transactions that contain non-transactional seller fees.
    """ # noqa: E501
    reference_id: Optional[StrictStr] = Field(default=None, description="The identifier of the transaction as specified by the <strong>referenceType</strong>. For example, with a <strong>referenceType</strong> of <strong>item_id</strong>, the <strong>referenceId</strong> refers to a unique item. This item may have several <code>NON_SALE_CHARGE</code> transactions.", alias="referenceId")
    reference_type: Optional[StrictStr] = Field(default=None, description="An enumeration value that identifies the reference type associated with the <strong>referenceId</strong>. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/finances/types/pay:ReferenceTypeEnum'>eBay API documentation</a>", alias="referenceType")
    __properties: ClassVar[List[str]] = ["referenceId", "referenceType"]

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
        """Create an instance of Reference from a JSON string"""
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
        """Create an instance of Reference from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "referenceId": obj.get("referenceId"),
            "referenceType": obj.get("referenceType")
        })
        return _obj


