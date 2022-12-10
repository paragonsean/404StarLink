# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.app_relationships_app_infos_links import AppRelationshipsAppInfosLinks
from openapi_client.models.build_relationships_beta_build_localizations_data_inner import BuildRelationshipsBetaBuildLocalizationsDataInner
from openapi_client.models.paging_information import PagingInformation
from typing import Optional, Set
from typing_extensions import Self

class BuildRelationshipsBetaBuildLocalizations(BaseModel):
    """
    BuildRelationshipsBetaBuildLocalizations
    """ # noqa: E501
    data: Optional[List[BuildRelationshipsBetaBuildLocalizationsDataInner]] = None
    links: Optional[AppRelationshipsAppInfosLinks] = None
    meta: Optional[PagingInformation] = None
    __properties: ClassVar[List[str]] = ["data", "links", "meta"]

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
        """Create an instance of BuildRelationshipsBetaBuildLocalizations from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in data (list)
        _items = []
        if self.data:
            for _item_data in self.data:
                if _item_data:
                    _items.append(_item_data.to_dict())
            _dict['data'] = _items
        # override the default output from pydantic by calling `to_dict()` of links
        if self.links:
            _dict['links'] = self.links.to_dict()
        # override the default output from pydantic by calling `to_dict()` of meta
        if self.meta:
            _dict['meta'] = self.meta.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of BuildRelationshipsBetaBuildLocalizations from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "data": [BuildRelationshipsBetaBuildLocalizationsDataInner.from_dict(_item) for _item in obj["data"]] if obj.get("data") is not None else None,
            "links": AppRelationshipsAppInfosLinks.from_dict(obj["links"]) if obj.get("links") is not None else None,
            "meta": PagingInformation.from_dict(obj["meta"]) if obj.get("meta") is not None else None
        })
        return _obj


