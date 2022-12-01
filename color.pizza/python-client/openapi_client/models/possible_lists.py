# coding: utf-8

"""
    Color Name API

    An API that provides names for colors based on their hex value

    The version of the OpenAPI document: 1.0.0
    Contact: color-name-api@elastiq.click
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import json
from enum import Enum
from typing_extensions import Self


class PossibleLists(str, Enum):
    """
    PossibleLists
    """

    """
    allowed enum values
    """
    DEFAULT = 'default'
    BESTOF = 'bestOf'
    WIKIPEDIA = 'wikipedia'
    FRENCH = 'french'
    RIDGWAY = 'ridgway'
    RISOGRAPH = 'risograph'
    BASIC = 'basic'
    CHINESETRADITIONAL = 'chineseTraditional'
    HTML = 'html'
    JAPANESETRADITIONAL = 'japaneseTraditional'
    LECORBUSIER = 'leCorbusier'
    NBSISCC = 'nbsIscc'
    NTC = 'ntc'
    OSXCRAYONS = 'osxcrayons'
    RAL = 'ral'
    SANZOWADAI = 'sanzoWadaI'
    THESAURUS = 'thesaurus'
    WERNER = 'werner'
    WINDOWS = 'windows'
    X11 = 'x11'
    XKCD = 'xkcd'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of PossibleLists from a JSON string"""
        return cls(json.loads(json_str))


