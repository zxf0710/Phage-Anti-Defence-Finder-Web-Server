import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listGenome(query) {
  return request({
    url: '/system/genome/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getGenome(phageId) {
  return request({
    url: '/system/genome/' + phageId,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addGenome(data) {
  return request({
    url: '/system/genome',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateGenome(data) {
  return request({
    url: '/system/genome',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delGenome(phageId) {
  return request({
    url: '/system/genome/' + phageId,
    method: 'delete'
  })
}


//列表排序
export function sortListGenome(query) {
  return request({
    url: '/system/genome/sortlist',
    method: 'get',
    params: query
  })
}


export function mhselectListGenome(condition) {
  return request({
    url: '/system/genome/mhselect/' + condition ,
    method: 'get',
  })
}
