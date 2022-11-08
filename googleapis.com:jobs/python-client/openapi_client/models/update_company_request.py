# coding: utf-8

"""
    Cloud Talent Solution API

    Cloud Talent Solution provides the capability to create, read, update, and delete job postings, as well as search jobs based on keywords and filters. 

    The version of the OpenAPI document: v3p1beta1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.company import Company
from typing import Optional, Set
from typing_extensions import Self

class UpdateCompanyRequest(BaseModel):
    """
    Input only. Request for updating a specified company.
    """ # noqa: E501
    company: Optional[Company] = None
    update_mask: Optional[StrictStr] = Field(default=None, description="Optional but strongly recommended for the best service experience. If update_mask is provided, only the specified fields in company are updated. Otherwise all the fields are updated. A field mask to specify the company fields to be updated. Only top level fields of Company are supported.", alias="updateMask")
    __properties: ClassVar[List[str]] = ["company", "updateMask"]

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
        """Create an instance of UpdateCompanyRequest from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of company
        if self.company:
            _dict['company'] = self.company.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of UpdateCompanyRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "company": Company.from_dict(obj["company"]) if obj.get("company") is not None else None,
            "updateMask": obj.get("updateMask")
        })
        return _obj


