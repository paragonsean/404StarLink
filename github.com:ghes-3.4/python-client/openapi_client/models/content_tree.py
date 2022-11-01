# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.content_directory_inner_links import ContentDirectoryInnerLinks
from openapi_client.models.content_tree_entries_inner import ContentTreeEntriesInner
from typing import Optional, Set
from typing_extensions import Self

class ContentTree(BaseModel):
    """
    Content Tree
    """ # noqa: E501
    links: ContentDirectoryInnerLinks = Field(alias="_links")
    download_url: Optional[StrictStr]
    entries: Optional[List[ContentTreeEntriesInner]] = None
    git_url: Optional[StrictStr]
    html_url: Optional[StrictStr]
    name: StrictStr
    path: StrictStr
    sha: StrictStr
    size: StrictInt
    type: StrictStr
    url: StrictStr
    __properties: ClassVar[List[str]] = ["_links", "download_url", "entries", "git_url", "html_url", "name", "path", "sha", "size", "type", "url"]

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
        """Create an instance of ContentTree from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of links
        if self.links:
            _dict['_links'] = self.links.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in entries (list)
        _items = []
        if self.entries:
            for _item_entries in self.entries:
                if _item_entries:
                    _items.append(_item_entries.to_dict())
            _dict['entries'] = _items
        # set to None if download_url (nullable) is None
        # and model_fields_set contains the field
        if self.download_url is None and "download_url" in self.model_fields_set:
            _dict['download_url'] = None

        # set to None if git_url (nullable) is None
        # and model_fields_set contains the field
        if self.git_url is None and "git_url" in self.model_fields_set:
            _dict['git_url'] = None

        # set to None if html_url (nullable) is None
        # and model_fields_set contains the field
        if self.html_url is None and "html_url" in self.model_fields_set:
            _dict['html_url'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ContentTree from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "_links": ContentDirectoryInnerLinks.from_dict(obj["_links"]) if obj.get("_links") is not None else None,
            "download_url": obj.get("download_url"),
            "entries": [ContentTreeEntriesInner.from_dict(_item) for _item in obj["entries"]] if obj.get("entries") is not None else None,
            "git_url": obj.get("git_url"),
            "html_url": obj.get("html_url"),
            "name": obj.get("name"),
            "path": obj.get("path"),
            "sha": obj.get("sha"),
            "size": obj.get("size"),
            "type": obj.get("type"),
            "url": obj.get("url")
        })
        return _obj


