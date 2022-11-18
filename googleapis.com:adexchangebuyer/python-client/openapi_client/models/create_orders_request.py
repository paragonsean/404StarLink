# coding: utf-8

"""
    Ad Exchange Buyer API

    Accesses your bidding-account information, submits creatives for validation, finds available direct deals, and retrieves performance reports.

    The version of the OpenAPI document: v1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.proposal import Proposal
from typing import Optional, Set
from typing_extensions import Self

class CreateOrdersRequest(BaseModel):
    """
    CreateOrdersRequest
    """ # noqa: E501
    proposals: Optional[List[Proposal]] = Field(default=None, description="The list of proposals to create.")
    web_property_code: Optional[StrictStr] = Field(default=None, description="Web property id of the seller creating these orders", alias="webPropertyCode")
    __properties: ClassVar[List[str]] = ["proposals", "webPropertyCode"]

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
        """Create an instance of CreateOrdersRequest from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in proposals (list)
        _items = []
        if self.proposals:
            for _item_proposals in self.proposals:
                if _item_proposals:
                    _items.append(_item_proposals.to_dict())
            _dict['proposals'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of CreateOrdersRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "proposals": [Proposal.from_dict(_item) for _item in obj["proposals"]] if obj.get("proposals") is not None else None,
            "webPropertyCode": obj.get("webPropertyCode")
        })
        return _obj


