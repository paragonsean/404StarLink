# coding: utf-8

"""
    Gateway

    Gateway is the hub that routes/orchestrates the interaction between consent managers and API bridges. There are 5 categories of APIs; discovery, link, consent flow, data flow and  monitoring. To reflect the consumers of APIs, the above apis are also categorized under cm facing, hiu facing and hip facing  

    The version of the OpenAPI document: 0.5
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.care_context_representation import CareContextRepresentation
from openapi_client.models.identifier_type import IdentifierType
from typing import Optional, Set
from typing_extensions import Self

class PatientRepresentation(BaseModel):
    """
    PatientRepresentation
    """ # noqa: E501
    care_contexts: Optional[List[CareContextRepresentation]] = Field(default=None, alias="careContexts")
    display: StrictStr
    matched_by: Optional[List[IdentifierType]] = Field(default=None, alias="matchedBy")
    reference_number: StrictStr = Field(alias="referenceNumber")
    __properties: ClassVar[List[str]] = ["careContexts", "display", "matchedBy", "referenceNumber"]

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
        """Create an instance of PatientRepresentation from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in care_contexts (list)
        _items = []
        if self.care_contexts:
            for _item_care_contexts in self.care_contexts:
                if _item_care_contexts:
                    _items.append(_item_care_contexts.to_dict())
            _dict['careContexts'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of PatientRepresentation from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "careContexts": [CareContextRepresentation.from_dict(_item) for _item in obj["careContexts"]] if obj.get("careContexts") is not None else None,
            "display": obj.get("display"),
            "matchedBy": obj.get("matchedBy"),
            "referenceNumber": obj.get("referenceNumber")
        })
        return _obj


